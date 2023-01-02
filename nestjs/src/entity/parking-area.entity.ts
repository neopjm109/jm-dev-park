import { Entity, Column, PrimaryGeneratedColumn } from "typeorm";

@Entity()
export class ParkingArea {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    createdAt: Date;

    @Column()
    updatedAt: Date;

    @Column()
    districtId: number;

    @Column()
    code: string;

    @Column()
    name: string;

    @Column()
    type: string;

    @Column()
    category: string;

    @Column()
    segment: number;

    @Column()
    level: string;

    @Column()
    isRotation: number;

    @Column()
    isPay: number;

    @Column()
    memo: string;

    @Column()
    managementId: number;

    @Column()
    latitude: number;

    @Column()
    longitude: number;

    @Column()
    lastUpdated: string;
}