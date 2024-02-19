#!/usr/bin/python3

import requests

def fetch_todos():
    todos_url = "https://jsonplaceholder.typicode.com/todos"
    response = requests.get(todos_url)
    if response.status_code == 200:
        todos = response.json()
        return todos
    else:
        print(f"Failed to fetch todos. Status code: {response.status_code}")
        return []

def organize_todos_by_user(todos):
    todos_by_user = {}
    for todo in todos:
        user_id = todo['userId']
        if user_id not in todos_by_user:
            todos_by_user[user_id] = []
        todos_by_user[user_id].append(todo)
    return todos_by_user

if __name__ == "__main__":
    todos = fetch_todos()
    if todos:
        todos_by_user = organize_todos_by_user(todos)
        for user_id, user_todos in todos_by_user.items():
            print(f"User {user_id} has been assigned the following tasks:")
            for todo in user_todos:
                print(f"- {todo['title']}")
            print()
    else:
        print("No todos fetched.")
