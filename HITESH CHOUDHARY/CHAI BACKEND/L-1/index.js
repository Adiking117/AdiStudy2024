require('dotenv').config()

const express = require('express')
// import express from "express"

const app = express()
// const port = 3000
// while publsihing on github it may be possible
// this port is not free on someone else machine

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/adi', (req,res)=>{
    res.send("Adi is learning backend");
})

app.get('/login', (req,res)=>{
    res.send('<h1> please login at adi.com </h1>')
})

app.get('/zoom',(req,res)=>{
    res.send("<h2> Adi is on zoom </h2>")
})

app.listen(process.env.PORT, () => {
  console.log(`Example app listening on port ${process.env.PORT}`)
})

