package itvdn.todolist.services;

import itvdn.todolist.domain.Tag;
import itvdn.todolist.repositories.TagRepositories;
import itvdn.todolist.services.interfaces.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagService implements ITagService {

    private final TagRepositories tagRepositories;

    @Autowired
    public TagService(TagRepositories tagRepositories) {
        this.tagRepositories = tagRepositories;
    }

    @Override
    @Transactional
    public Tag findOrCreate(Tag tag) {

        List<Tag> foundTag = tagRepositories.findByName(tag.getName());

        if(foundTag.isEmpty()){
            tagRepositories.save(tag);
            return tag;
        } else {
            return foundTag.get(0);
        }
    }
}
