package com.mari.mvc.mudi.repository;

import com.mari.mvc.mudi.model.Pedido;
import com.mari.mvc.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByStatus(StatusPedido aguardando);
}
