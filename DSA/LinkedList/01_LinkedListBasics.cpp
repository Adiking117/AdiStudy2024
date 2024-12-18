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
        cout<< mover->data << " " << endl;
        mover = mover->next;
        (*count)++;
    }
}

bool SearchInLL(Node* head , int value){
    Node* mover = head;
    while(mover){
        if(mover->data == value) return true;
        mover = mover->next;
    }
    return false;
}



int main(){
    vector<int> arr = {10,20,30,40,50};
    Node* head = convertArr2LL(arr);

    int count = 0;
    printLinkedList(head,&count);
    cout<< "The length of LL "<< count << endl;
    
    cout << SearchInLL(head,30) << endl;
    return 1;
}