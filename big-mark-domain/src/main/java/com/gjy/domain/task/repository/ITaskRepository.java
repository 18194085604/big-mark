package com.gjy.domain.task.repository;

import com.gjy.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @description 任务服务仓储接口
 */
public interface ITaskRepository {

    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
