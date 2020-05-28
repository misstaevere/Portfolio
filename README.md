# QA Portfolio

## Overview
The QA Portfolio is a centralised location for the end of day challenges completed.

In each question you will find:
- A Question class with an empty method inside to be completed by the 
learner
- A Test class with pre-built test cases. This runs against the Question 
class which will determine whether or not the question has been "done".


You will need to:
- Fork this repository to your own repository list on github.
- On your desktop open up a git bash terminal
- Clone your repository using ssh to your local PC.
- cd into the cloned repository
- Run `git remote -v` and it should come up with your remote repository
- Inside the each task, fill in the Question class with your answers
- Test that your solution works by running the test file
- Once the tests pass, commit your work and push it to your github 
repository using the feature-branch model

Over time additional questions will appear.
You will need to add this repository using:

`git remote add questions 
git@github.com:christophperrins/Portfolio.git`

In your **master** branch you can pull down and merge the new 
changes by running:

`git rebase questions/master`

With the new question(s) in your master, create a new branch to code for 
that question. Once finished with the question and tested that it is 
working, merge it into your master branch.
