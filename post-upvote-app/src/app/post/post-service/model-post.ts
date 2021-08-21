export class Post {
    postId: number;
    text: string;
    user: string;
    upvote: number;
    registerTime: Date = new Date();
}