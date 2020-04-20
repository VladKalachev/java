package itvdn.todolist.services;

import itvdn.todolist.domain.Tag;
import itvdn.todolist.repositories.TagRepositorues;
import itvdn.todolist.services.interfaces.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagService implements ITagService {

    private final TagRepositorues tagRepositorues;

    @Autowired
    public TagService(TagRepositorues tagRepositorues) {
        this.tagRepositorues = tagRepositorues;
    }

    @Override
    @Transactional
    public Tag findOrCreate(Tag tag) {

        List<Tag> foundTag = tagRepositorues.findByName(tag.getName());

        if(foundTag.isEmpty()){
            tagRepositorues.save(tag);
            return tag;
        } else {
            return foundTag.get(0);
        }
    }
}
