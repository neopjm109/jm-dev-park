import { Entity, Column, PrimaryColumn } from "typeorm";

@Entity()
export class User {
    @PrimaryColumn()
    id: string;
    
    @Column()
    createdAt: Date;
    
    @Column()
    updatedAt: Date;
    
    @Column()
    loginId: string;
    
    @Column()
    loginPwd: string;
    
    @Column()
    status: string;
    
    @Column()
    role: string;
    
    @Column()
    name: string;
}