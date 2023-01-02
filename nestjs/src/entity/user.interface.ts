export interface User {
    id: string;
    createdAt: Date;
    updatedAt: Date;
    loginId: string;
    loginPwd: string;
    status: string;
    role: string;
    name: string;
}