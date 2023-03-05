const router = require('express').Router();
let Data = require('../models/data.model');


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

router.route('/add').post((req, res) => {

  console.log("Data is being sent to mongoose server")
  const stats = "hdfehfeoifheo";
  const newData = new Data({
    stats
  });
  newData.save()
  .then(() => res.json('data send!'))
  .catch(err => res.status(400).json('Error: ' + err));

});

module.exports = router;