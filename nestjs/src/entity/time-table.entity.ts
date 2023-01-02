import { Entity, Column, PrimaryColumn } from "typeorm";

@Entity()
export class TimeTable {
    @PrimaryColumn()
    areaId: number;
    
    @PrimaryColumn()
    type: string;
    
    @Column()
    createdAt: Date;
    
    @Column()
    updatedAt: Date;
    
    @Column()
    openAt: string;
    
    @Column()
    closeAt: string;
}