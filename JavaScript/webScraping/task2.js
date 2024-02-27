#!/usr/bin/node

/**
 * a script that write a content to a file
*/

const fs = require('fs');
const filePath = process.argv[2];
const data = process.argv[3];

fs.writeFile(filePath, data, (err) => {
  if (err) {
    console.log(err);
  }
});
