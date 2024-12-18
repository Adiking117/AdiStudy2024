#include<iostream>
#include<stdlib.h>
#include<bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node(int dataValue , Node* nextAddress){
        data = dataValue;
        next = nextAddress;
    }
    Node(int dataValue){
        data = dataValue;
        next = nullptr;
    }
};

Node* convertArr2LL(vector<int> &arr){
    Node* head = new Node(arr[0],nullptr);
    Node* mover = head;
    for(int i=1 ; i<arr.size() ; i++ ){
        Node* temp = new Node(arr[i],nullptr);
        mover->next = temp;
        mover = mover->next;
    }
    return head;
}

void printLinkedList(Node* head,int* count){
    Node* mover = head;
    while(mover){
        cout<< mover->data << " " ;
        mover = mover->next;
        (*count)++;
    }
    cout<< endl;
}

bool SearchInLL(Node* head , int value){
    Node* mover = head;
    while(mover){
        if(mover->data == value) return true;
        mover = mover->next;
    }
    return false;
}

Node* InsertKThElement(Node* head, int valueToBeInserted , int k){
    if(head == nullptr){
        if(k == 1){
            return new Node(valueToBeInserted);
        }else{
            return head;
        }
    }

    if(k == 1){
        return new Node(valueToBeInserted,head);
    }

    int count = 0;
    Node* temp = head;
    while(temp){
        count++;
        if(count == k-1){
            Node* newNodeToInsert = new Node(valueToBeInserted,temp->next);
            temp->next = newNodeToInsert;
            break;
        }
        temp = temp->next;
    }
    
    return head;

}

Node* InsertBeforeValue(Node* head, int valueToBeInserted , int v){
    if(head == nullptr){
        return nullptr;
    }

    if(head->data == v){
        return new Node(valueToBeInserted,head);
    }

    Node* temp = head;
    while(temp->next){
        if(temp->next->data == v){
            Node* newNodeToInsert = new Node(valueToBeInserted,temp->next);
            temp->next = newNodeToInsert;
            break;
        }
        temp = temp->next;
    }
    
    return head;

}


Node* DeleteKThElement(Node* head, int k){
    if(head == nullptr) 
        return nullptr;
    if(k == 1){
        Node* temp = head;
        head = head->next;
        delete temp;
    }

    int count = 0;
    Node* temp = head;
    Node* prev = nullptr;
    while(temp){
        count++;
        if(count == k){
            prev->next = temp->next;
            delete temp;
            break;
        }
        prev = temp;
        temp = temp->next;
    }
    
    return head;
}

Node* DeleteByValue(Node* head, int v){
    if(head == nullptr) 
        return nullptr;
        
    if(head->data == v){
        Node* temp = head;
        head = head->next;
        delete temp;
    }

    Node* temp = head;
    Node* prev = nullptr;
    while(temp){
        if(temp->data == v){
            prev->next = temp->next;
            delete temp;
            break;
        }
        prev = temp;
        temp = temp->next;
    }
    
    return head;
}

int main(){
    vector<int> arr = {10,20,30,40,50};
    Node* head = convertArr2LL(arr);

    int count = 0;
    printLinkedList(head,&count);
    // cout<< "The length of LL "<< count << endl;
    
    // cout << SearchInLL(head,30) << endl;

    head = InsertKThElement(head,25,1);
    printLinkedList(head,&count);

    head = InsertBeforeValue(head,35,40);
    printLinkedList(head,&count);

    head = DeleteKThElement(head,4);
    printLinkedList(head,&count);
    
    head = DeleteByValue(head,40);
    printLinkedList(head,&count);


    return 1;
}