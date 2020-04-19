package itvdn.todolist.services;

import itvdn.todolist.domain.Tag;
import itvdn.todolist.services.interfaces.ITagService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class TagService implements ITagService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Tag findOrCreate(Tag tag) {

        List<Tag> foundTag = entityManager
                .createQuery("SELECT tag FROM Tag tag WHERE tag.name = :name", Tag.class)
                .setParameter("name", tag.getName())
                .getResultList();

        if(foundTag.isEmpty()){
            entityManager.persist(tag);
            return tag;
        } else {
            return foundTag.get(0);
        }
    }
}
