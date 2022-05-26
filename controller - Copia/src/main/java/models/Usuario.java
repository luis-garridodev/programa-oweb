package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Entity(name="usuarios")

public class Usuario {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String login;
	private String senha;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

public enum Categoria {

 POLITICA,
ESPORTE,
 EDUCACAO,
 COTIDIANO,
 FOFOCAS;
 }
@Entity(name="posts")
public class Post {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String titulo;
 private String texto;
 @ManyToOne
 private Usuario usuario;
 
 @Enumerated(EnumType.STRING)
  private Categoria categoria = Categoria.POLITICA;

 public Long getId() {
 return id;
 }
 public void setTitulo(String titulo) {
	 this.titulo = titulo;
	 }
	 public String getTexto() {
	 return texto;
	 }
	 public void setTexto(String texto) {
	 this.texto = texto;
	 }
	 @RestController
	  public class PostController {
	  @RequestMapping("/posts")
	  public Post listar() {
	  Post post=new Post();
	  post.setTitulo("Titulo de exemplo");
	  return post;
	  }
	  }
	 
	
}
}
