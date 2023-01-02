import { Entity, Column, PrimaryColumn } from "typeorm";

@Entity()
export class PayMethod {    
    @PrimaryColumn()
    areaId: number;
    
    @PrimaryColumn()
    type: string;
    
    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;
}