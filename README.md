## Virat Kohli's Greatest Knocks API
Welcome to the Virat Kohli's Greatest Knocks API! This backend project serves the purpose of delivering one of Virat Kohli's greatest cricket innings in a random order whenever a request is made.

## Features
* Random Knock Selection: Each API request returns a random selection from a list of Virat Kohli's greatest cricket innings.
* Statistical Details: Along with the match description, the API provides detailed statistics such as score, opposition.
* Simple RESTful API: The backend is designed to be lightweight and easy to integrate with any frontend or other services.
## Endpoints
### GET/randomImage
Returns a JSON object containing details of one of Virat Kohli's greatest cricket innings.

#### Response Format


```
json

"tournament" : "2012 Champions Trophy",
"description":"Virat Kohli scored a match-winning 103 not out to lead India to victory in the final against Pakistan.",
"imageUrl" : "$BASE_URL/images/v1.jpg"

```

## Getting Started
### Prerequisites
* Node.js
* npm (Node Package Manager)
#### Installation
1. Clone the repository:

```
git clone https://github.com/your-username/ktor-sample.git
cd ktor-sample
```
2. Install the dependencies:

```
npm install
```
3. Start the server:

```
npm start
```

The server will start running on  http://localhost:3000. 

#### Usage
Send a GET request to the following endpoint to receive a random knock of Virat Kohli:

```
http://localhost:8100/randomImage
```
