package project.service;

import project.domain.Actor;
import project.repository.ActorRepository;


public class ActorService {

    ActorRepository actorRepository = new ActorRepository();

    public void createActor(String name, Long year, Long month, Long day, Long height, String instagram) {
        Actor actor = new Actor();

        actor.setName(name);
        actor.setYear(year);
        actor.setMonth(month);
        actor.setDay(day);
        actor.setHeight(height);
        actor.setInstagram(instagram);

        actorRepository.save(actor);
    }


    public Actor findOneWithID(Long id) {
        return actorRepository.findOneWithID(id);
    }

}
