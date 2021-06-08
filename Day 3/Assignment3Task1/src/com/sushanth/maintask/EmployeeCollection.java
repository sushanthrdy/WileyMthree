package com.sushanth.maintask;

import java.util.*;

import com.sushanth.customexcpetions.NameAlreadyExists;

public class EmployeeCollection {
	private Set<String> tempSet = new HashSet<String>();
	public Set getTempSet() {
		return tempSet;
	}
	public void setTempSet(Set tempSet) {
		this.tempSet = tempSet;
	}
	public void checkDuplicateUsingAdd(String input) {
  
            if (!tempSet.add(input)) {
            	throw new NameAlreadyExists("Name already exist");
            }
        }

}

