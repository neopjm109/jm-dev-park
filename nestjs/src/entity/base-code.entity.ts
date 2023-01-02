import { Entity, Column, PrimaryColumn } from "typeorm";

@Entity()
export class BaseCode {
    @PrimaryColumn()
    code: string;

    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;

    @Column()
    name: string;

    @Column()
    data1: string;

    @Column()
    data2: string;

    @Column()
    data3: string;

    @Column()
    data4: string;
}