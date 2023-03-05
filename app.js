const crypto = require('crypto');
const fs = require('fs');
const express = require('express');
const cors = require('cors');
http = require('http');
const mongoose = require('mongoose');

const router = require('express').Router();
let Data = require('./models/data.model');
const { initializeApp, applicationDefault, cert } = require('firebase-admin/app');
const { getFirestore, Timestamp, FieldValue } = require('firebase-admin/firestore');

const serviceAccount = require('./private.json');

initializeApp({
  credential: cert(serviceAccount)
});

const db = getFirestore();

require('dotenv').config();

const app = express();

app.use(cors());
app.use(express.json());

const uri = process.env.ATLAS_URI;
mongoose.connect(uri, { useNewUrlParser: true}
);

const connection = mongoose.connection;
connection.once('open', () => {
  console.log("MongoDB database connection established successfully");
})

const dataRouter = require('./routes/data');

// app.use('/', dataRouter);

// app.get('/', (req, res) => {

//     console.log("Data is being sent to mongoose server")
//     const stats = "hdfehfeoifheo";
//     const newData = new Data({
//       stats
//     });
//     newData.save()
//     .then(() => res.json('data send!'))
//     .catch(err => res.status(400).json('Error: ' + err));
    
// });

// Start server
app.listen(3000, () => {
  console.log('Server running on port 3000');
});

db.collection('doc1').onSnapshot(docSnapshot => {
    console.log(`Received doc snapshot: ${docSnapshot}`);
    // console.log(docSnapshot.data());
    // docSnapshot.docs.forEach((doc)=>{
    //     console.log(doc.data());
    // })
    app.get('/', (req, res) => {
      res.redirect('/add');
    })

    docSnapshot.docChanges().forEach((change)=>{

      function encryptText (plainText) {
        return crypto.publicEncrypt({
          key: fs.readFileSync('public_key.pem', 'utf8'),
          padding: crypto.constants.RSA_PKCS1_OAEP_PADDING,
          oaepHash: 'sha256'
        },
        // We convert the data string to a buffer
        Buffer.from(plainText)
        )
      }
        let foo = JSON.stringify(change.doc.data());
        // console.log(encryptText(foo));
        console.log(change.doc.data())
      
    })
    // ...
  }, err => {
    console.log(`Encountered error: ${err}`);

  });

  app.get('/add', (req, res) => {

    console.log("Data is being sent to mongoose server")const router = require('express').Router();
    let Inventory = require('../models/inventory.model');
    
    router.route('/').get((req, res) => {
      Inventory.find()
        .then(inventory => res.json(inventory))
        .catch(err => res.status(400).json('Error: ' + err));
    });
    
    const stats = "hdfehfeoifheo";
    const newData = new Data({
      stats
    }); app.post('/add', (req, res) => {
      res.send("POST Request Called")
    })
    newData.save()
    .then(() => res.json('data send!'))
    .catch(err => res.status(400).json('Error: ' + err));
  });