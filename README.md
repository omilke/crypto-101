# crypto-101
Accompanying code to my talk Crypto 101 (https://speakerdeck.com/omilke/crypto-101)

## Certificate Example

Create and view the private key

    openssl genrsa -out domain.key 2048
    cat domain.key
Build and view a CSR from private key

    openssl req -new -sha256 -key domain.key -out domain.csr
    cat domain.csr
    openssl req -noout -text -in domain.csr