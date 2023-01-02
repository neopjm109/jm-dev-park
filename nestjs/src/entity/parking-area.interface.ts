export interface ParkingArea {
    id: number;
    createdAt: Date;
    updatedAt: Date;
    districtId: number;
    code: string;
    name: string;
    type: string;
    category: string;
    segment: number;
    level: string;
    isRotation: number;
    isPay: number;
    memo: string;
    managementId: number;
    latitude: number;
    longitude: number;
    lastUpdated: string;
}