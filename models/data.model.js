const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const dataSchema = new Schema({
  stats: { type: String, required: true },
}, {
  timestamps: true,
});

const data = mongoose.model('data', dataSchema);

module.exports = data;