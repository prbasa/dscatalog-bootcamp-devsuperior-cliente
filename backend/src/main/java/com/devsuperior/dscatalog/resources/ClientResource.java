package com.devsuperior.dscatalog.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "PAULO ROBERTO BARBOSA", "03523134633", 1000d, Instant.parse("1979-10-17T15:30:30Z"),
				0));
		list.add(new Client(2L, "MARIA JOAQUINA DE SOUZA", "12345678987", 2000d, Instant.parse("2000-10-17T13:30:10Z"),
				2));
		list.add(new Client(3L, "JOAO PEDRO MACHADO", "78901101213", 3000d, Instant.parse("1994-02-10T12:00:40Z"), 3));

		return ResponseEntity.ok().body(list);
	}

}
