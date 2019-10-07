# BDD
# Features BDD

An analysis is written in BDD format that describes the behavior for each possible scenario, using the following keys: 
Scenario schema: Lets you create table in each table row that represents a scenario. 
Context: Precondition for running all scenarios. Data: Precondition for scenario execution.
When: Action performed by the user. Then: Result of the action taken.
E: Complement of the information instruction in the previous line. 
But: Negative form of "then".

# How to generate from Features:

In the project root folder run:

```
yard config load_plugins true & bundle exec rake yard
```


Após concluído, abra o arquivo index.html na pasta doc.

