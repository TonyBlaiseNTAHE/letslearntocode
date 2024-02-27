#!/usr/bin/node

/**
 * A script that scrap a id into an API
*/
const request = require('request');
const id = process.argv[2];

let url = 'https://swapi-api.alx-tools.com/api/films/${id}';

request(url, function (err, response, body) {
	if (err)
	{
		console.log(err);
		return;
	}
	else if (response.statusId < 200 && response.statusCode > 300) {
		console.log(err);
	}
	else {
		const title = body.title;
		console.log(body);
	}
});
