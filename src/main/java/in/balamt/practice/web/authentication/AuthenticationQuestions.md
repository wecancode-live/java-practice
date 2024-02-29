#Authentication

###Questions
1. How does biometric authentication work?
    * It measures physical traits to verify identity. Matching the physical traits to an authorized profile accurate identity verification.
2. Why is authentication considered a fundamental tool for controlling access?
    * It confirms a person's identity before granting access. (Authentication is the key to access control by verifying
      whether someone is who they claim to be, protecting against unauthorized access)
3. How does a safe with a combination lock and key illustrate MultiFactorAuthentication (MFA)?
    * It uses both something you know and something you have. (The combination and the key are different form of security)
      measures, fulfilling the MultiFactorAuthentication criteria.
4. What is a potential issue with the recovery process in MultiFactorAuthentication?
    * Account recovery can be difficult if user loses their devices.
5. A club requires a special ID badge for entry. What type of authentication factor does the ID badge represent?
    * It is **ownership**-based authentication, as entry depends on processing a specific item. (An ID badge, a key
      and a credit card are all examples of ownership-based authentication, where access is granted based on having an item).
6. Why should a website avoid specifying the incorrect credential upon login failure?
    * To prevent account enumeration by attacker (If we print message saying "Username is wrong" or
      "Password is incorrect" - Attackers knows which one is correct and which one is wrong and thus it is good to have message
      like "Username or Password is incorrect")