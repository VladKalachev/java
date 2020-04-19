package itvdn.todolist.services.interfaces;

import itvdn.todolist.domain.Tag;

public interface ITagService {
    Tag findOrCreate(Tag tag);
}
