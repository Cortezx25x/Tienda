
package com.tienda.service;

import java.util.List;

public class ClienteServicempl implements ClienteService {
    public Listt<Cliente> getClientes();
    public void save(Cliente cliente);
    public void delete(Cliente cliente);
    public Cliente getClientes(Cliente cliente);
}
