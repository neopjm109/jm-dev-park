import { Entity, Column, PrimaryColumn } from "typeorm";

@Entity()
export class Ticket {
    @PrimaryColumn()
    id: string;
    
    @Column()
    createdAt: Date;
    
    @Column()
    updatedAt: Date;
    
    @Column()
    areaId: number;
    
    @Column()
    userId: string;
    
    @Column()
    type: string;
    
    @Column()
    minute: number;
    
    @Column()
    price: number;
    
    @Column()
    status: string;
    
    @Column()
    payMethod: string;
    
    @Column()
    payDate: string;
    
    @Column()
    cardCode: string;
    
    @Column()
    cardNumber: string;
}