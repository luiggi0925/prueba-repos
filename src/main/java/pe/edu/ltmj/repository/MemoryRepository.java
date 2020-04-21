package pe.edu.ltmj.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pe.edu.ltmj.entity.Repo;

public class MemoryRepository implements PruebaRepository<Repo, Integer>{

	private Map<Integer,Repo> mapRepo = new HashMap<Integer,Repo>();
	
	@Override
	public void save(Repo entity) {
		mapRepo.put(entity.getNumber(), entity);
	}

	@Override
	public Repo findOne(Integer index) {
		return mapRepo.get(index);
	}

	@Override
	public void delete(Integer index) {
		mapRepo.remove(index);
	}

	@Override
	public List<Repo> getAll() {
		return mapRepo.values().stream().collect(Collectors.toList());
	}
}
