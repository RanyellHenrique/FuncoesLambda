package entities;

public class Funcionarios {
	
	private String name;
	private String email;
	private Double salario;
	
	
	public Funcionarios(String name, String email, Double salario) {
		this.name = name;
		this.email = email;
		this.salario = salario;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
		@Override
	public String toString() {
		return "Funcionarios [name=" + name + ", email=" + email + ", salario=" + salario + "]";
	}

}
