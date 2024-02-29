#PasswordHashing


###Do's and Dont's
1. Do not store password in plain text in anywhere.
2. Always hash the password and store them.
3. Use encryption algorithm to encrypt the password.

```text
Same Input + Same Hashing algorithm = Same output

md5("secret") => "ert34fi778587w58w59843w5e54t6"

Now When Someone enters password as "secret" and if the application uses md5 algorithm,
it will produce the same hash/encrypted text. which can be used to authenticate the password.

```
