package br.com.cod3r.cm.modelo;

@FunctionalInterface
public interface CampoObeservador {

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}