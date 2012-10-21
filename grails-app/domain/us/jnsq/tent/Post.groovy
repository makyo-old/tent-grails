package us.jnsq.tent

class Post {

    String id
    Entity entity
    Date publishedAt
    Date receivedAt
    String type
    // App app
    // Views views
    Boolean limited
    Group group

    static constraints = {
    }

    static hasMany = [mentions: Entity, licenses: License, attachments: Attachment]
}
