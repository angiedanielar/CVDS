package edu.eci.cvds.tdd.registry;

public class Registry {
	
    public RegisterResult registerVoter(Person p) {
    	RegisterResult personRegisterResult= null;
    	if (p.getAge() < 0 || p.getAge()> 100) { personRegisterResult= RegisterResult.INVALID_AGE;}
    	else if(p.getAge()>= 0 && p.getAge()< 18) { personRegisterResult= RegisterResult.UNDERAGE;}
    	else if(!p.isAlive()) { personRegisterResult= RegisterResult.DEAD;}
    	else if(p.isInPrison()) { personRegisterResult= RegisterResult.INPRISON;}
    	else if(p.isMilitar()) { personRegisterResult= RegisterResult.MILITAR;}
    	else { personRegisterResult= RegisterResult.VALID;}
        // TODO Validate person and return real result.
        return personRegisterResult;
    }
}



