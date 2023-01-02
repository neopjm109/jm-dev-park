import { Entity, Column, PrimaryGeneratedColumn } from "typeorm";

@Entity()
export class Management {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;

    @Column()
    name: string;

    @Column()
    tel: string;
}