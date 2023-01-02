import { Entity, Column, PrimaryGeneratedColumn } from "typeorm";

@Entity()
export class Reservation {
    @PrimaryGeneratedColumn()
    id: string;
    
    @Column()
    createdAt: Date;
    
    @Column()
    updatedAt: Date;
    
    @Column()
    ticketId: number;
    
    @Column()
    startAt: Date;
    
    @Column()
    endAt: Date;
}