package models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import models.Usuario.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	@RestController
	 public class PostController {
	 @Autowired
	 private PostRepository repository;
	
	 @RequestMapping("/posts")
	 public List<Post> listar() {
	 return repository.findAll();
	 
	
	 }
	 public class PostDto {
		  private Long id;
		  private String titulo;
		  private String texto;
		  private String usuario;
		  private Categoria categoria;
		 
		  public PostDto(Post post) {
		  this.id = post.getId();
		  this.titulo = post.getTitulo();
		  this.texto = post.getTexto();
		  this.usuario = post.getUsuario().getNome();
		  this.categoria = post.getCategoria();
		  }
		 
		  public static List<PostDto> converte(List<Post> lista){
		  return lista.stream().map(PostDto::new).collect(Collectors.toList());
		  {
			  "id": 1,
			  "titulo": "Dúvida",
			  "texto": "Erro ao criar projeto",
			  "usuario": {
			  "id": 1,
			   "nome": "Aluno",
			   "login": "aluno@email.com",
			   "senha": "123456"
			   },
			   "categoria": "EDUCACAO"
			   },
		  
		  
		  }
	 }
	 @RestController
	 public class PostController {
	 @Autowired
	 private PostRepository repository;
	
	 @RequestMapping("/posts")
	 public List<PostDto> listar() {
	 return PostDto.converte(repository.findAll());
	 {
		 "id": 1,
		. "titulo": "Dúvida",
		 "texto": "Erro ao criar projeto",
		 "usuario": "Aluno",
		 "categoria": "EDUCACAO"
		 },
		 {
		 "id": 2,
		 "titulo": "Pesquisa Eleitoral",
		 "texto": "Divulgada nova pesquisa",
		 "usuario": "Manoel",
		 "categoria": "POLITICA"
		 }
	 }
	 
	 }
  

}
