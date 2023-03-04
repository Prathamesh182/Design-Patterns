package com.aurionpro.model;

public class OperationStrategy {
	private IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}
	
	@Override
	public String toString() {
		return "OperationStrategy [operation=" + operation + "]";
	}

	public int SetOperation(IOperation operation) {
		return operation.doOperation(10, 20);
	}
}
