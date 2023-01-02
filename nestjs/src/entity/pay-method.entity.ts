import { Entity, Column } from "typeorm";

@Entity()
export class PayMethod {    
    @Column()
    areaId: number;
    
    @Column()
    type: string;
    
    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;
}