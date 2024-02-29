#MultiFactorAuthentication (MFA)

More than single authentication is call MFA or 2FA

```text

Knowledge + Ownership + Inherence = MultiFactorAuthentication

Credentials + Access + SMS/OTP/Physical/Additional Security is called MFA or 2FA (Two Factor Authentication)

```

Consider if your username and password is compromised, but when we have
2FA or MFA configured. Hackers cannot take control of the account.

##Software Authenticator
1. Google Auth
2. Microsoft Authenticator
3. RFA token
4. TOTP - Time based One Time Password
5. Authy

##Hardware Authenticator
1. Phone
2. RSA token generator
3. USB with encrypted key (example: BitLocker)

[https://2fa.directory](https://2fa.directory) - can be used to find all the available tools.


## Pitfalls of MFA
1. Development effort and expense to setup
2. Additional security layers adds frictions, inconvenience
3. Recovery process when users losses the phone or device to authorize the MFA request.
4. OTS via SMS sometimes gets stuck because of poor service or limited network.
5. Phone SIM cards be hijacked.

