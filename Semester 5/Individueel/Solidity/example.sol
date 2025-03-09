pragma solidity ^0.8.0;

// Definitie van een Smart Contract
contract SimpleToken {

    // Definitie van de eigenaar
    address public owner;

    // Mapping van alle balansen van de gebruikers
    mapping(address => uint256) public balances;

    // Events om transacties vast te leggen
    event Transfer(address indexed from, address indexed to, uint256 value);

    // Constructor die wordt uitgevoerd bij het maken van het contract
    constructor() {
        owner = msg.sender;
    }

    // Functie om tokens over te dragen van de ene gebruiker naar de andere
    function transfer(address to, uint256 value) public {
        // Require verifeert een conditie
        require(balances[msg.sender] >= value, "Onvoldoende saldo");

        balances[msg.sender] -= value;
        balances[to] += value;

        emit Transfer(msg.sender, to, value);
    }
}
