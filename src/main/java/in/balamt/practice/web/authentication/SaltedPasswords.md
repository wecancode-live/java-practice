#Salted Passwords

If we are using Blowfish/bcrypt then we dont need to worry, becaust it uses the salting.
Other algorithm may need it
Brute-force attacks are time-comsuming
Attacks do not have to be on one passwors at a time
Can precompute hash values for a hashing algorithm


##Rainbow Tables

Precomputed tables of password hashes for each hashing algorithm

Below table is maintaining the hashed value and plain text password, which can be referenced by attackers when attempting 
to brute-force.

| Password   | SHA-1 Hash                        |
|------------|-----------------------------------|
| letmein    | w87rt2gi37oo38rfserwt4gt344g65643 |
| secret     | w4k4k4k4k4k4k4k4k4k4ktb7743t5k744 |
| R*2k67#j1b | kbd7tfiw7etf7kdgwetk7wyfetiuk8we7 |


##Salt
* It is added to the plain text, before hashing.
* ("mySalt" + p@5sw0rd) -> w7etfw7ewke2ik37rgb32r342t
* Knowing the password requires also knowing the salt string.


## Unique and Random salt values
* Create salt using unique string
* Choose string that do not change
* Create and store long random values
* Salt values does not need to be secret to serve its purpose.
* If data breach and salt is with attacker, they can now use Rainbow table to find the pattern.

##Hashing Algorithms with Salting:
1. Blowfish/bcrypt the salting is built-in, it creates own unique salt and hash the plan string and appends 
salt to the hashed value and store together.
2. Retrieves the salt value, uses salt to hash attempted password string, compares with stores hash value.

