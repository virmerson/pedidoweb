package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.Package;

public interface PackageRepository extends JpaRepository<Package, Long> {

}
