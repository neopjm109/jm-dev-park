import { Entity, Column, PrimaryColumn } from "typeorm";

@Entity()
export class Address {
    @PrimaryColumn()
    areaId: number;

    @PrimaryColumn()
    type: string;

    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;

    @Column()
    address: string;
}