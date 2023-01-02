import { Entity, Column } from "typeorm";

@Entity()
export class TimeTable {
    @Column()
    areaId: number;
    
    @Column()
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