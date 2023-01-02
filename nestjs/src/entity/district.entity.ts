import { Entity, Column, PrimaryGeneratedColumn } from "typeorm";

@Entity()
export class District {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;

    @Column()
    name: string;
}