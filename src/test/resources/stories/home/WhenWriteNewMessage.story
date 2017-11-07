Meta:

Narrative:
As a user
I want to send email to me or other users
So that I can keep communication with them

Scenario: user send email to himself
Given a user is logged in with [login] and [password]
When user send new email to [recipient] with email [body]
Then recipient should get email from this user with same email [body]

Examples:
|login|password|recipient|body|
|epam.FinalTask1@gmail.com|epamfinaltask|epam.FinalTask1@gmail.com|ChupaPukaBukaKuka|
