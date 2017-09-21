package bean.estudante;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import bean.estudante.model.Estudante;

@Named
public class EstudanteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Estudante estudante;
	private String[] nomesArray = { "DevDojo", "eh", "foda" };
	private List<String> nomesList = Arrays.asList("Victor", "Hugo", "Silva");
	private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku", "Luffy", "Naruto"));
	private Map<String, String> nomesMap = new HashMap<>();

	public Map<String, String> getNomesMap() {
		return nomesMap;
	}

	public void setNomesMap(Map<String, String> nomesMap) {
		this.nomesMap = nomesMap;
	}

	{
		nomesMap.put("Goku", "O mais forte");
		nomesMap.put("One piece", "O mais longo");
		nomesMap.put("Naruto", "O com mais lenga lenga");
	}

	// gets and sets
	public String[] getNomesArray() {
		return nomesArray;
	}

	public List<String> getNomesList() {
		return nomesList;
	}

	public void setNomesList(List<String> nomesList) {
		this.nomesList = nomesList;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public Set<String> getNomesSet() {
		return nomesSet;
	}

	public void setNomesSet(Set<String> nomesSet) {
		this.nomesSet = nomesSet;
	}

}
