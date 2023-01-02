import { Entity, Column } from "typeorm";

@Entity()
export class Address {
    @Column()
    areaId: number;

    @Column()
    type: string;

    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;

    @Column()
    address: string;
}