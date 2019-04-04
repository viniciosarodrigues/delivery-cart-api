package br.com.niv.cart.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StandardError implements Serializable {

	private static final long serialVersionUID = 8631826279634701401L;

	private Long timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
}